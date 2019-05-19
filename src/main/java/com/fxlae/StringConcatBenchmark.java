package com.fxlae;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.slf4j.helpers.MessageFormatter;

@Warmup(iterations = 4)
@Measurement(iterations = 3)
@Fork(value = 2)
public class StringConcatBenchmark {

	@State(Scope.Thread)
	public static class State2 {
		public String a = "mq9V2A57tslGH6SfaFqgNjsDyE7pY3xFKWpCwhhqKZFHMYC92aGBIIt2XlXw";
		public String b = "7y9N3G09EqxDblwhHzsv18WU4gzWfiAZw6mMsVWQHltIv3IReRhWQHytdxPD";
	}

	@State(Scope.Thread)
	public static class State3 {
		public String a = "mq9V2A57tslGH6SfaFqgNjsDyE7pY3xFKWpCwhhqKZFHMYC92aGBIIt2XlXw";
		public String b = "7y9N3G09EqxDblwhHzsv18WU4gzWfiAZw6mMsVWQHltIv3IReRhWQHytdxPD";
		public String c = "Z3YQ2vpG6KUckJ3J7myXnUNNJQsVduanxBRDOwWur7byk9WXLOLIuYbe9AFs";
	}

	@State(Scope.Thread)
	public static class State4 {
		public String a = "mq9V2A57tslGH6SfaFqgNjsDyE7pY3xFKWpCwhhqKZFHMYC92aGBIIt2XlXw";
		public String b = "7y9N3G09EqxDblwhHzsv18WU4gzWfiAZw6mMsVWQHltIv3IReRhWQHytdxPD";
		public String c = "Z3YQ2vpG6KUckJ3J7myXnUNNJQsVduanxBRDOwWur7byk9WXLOLIuYbe9AFs";
		public String d = "Aev4ebmDx49CTC5BTiPv8lcCB810KJ1J6SfqDkjG9Ad8caWjYSYCz5ox4J9y";
	}

	@State(Scope.Thread)
	public static class State5 {
		public String a = "mq9V2A57tslGH6SfaFqgNjsDyE7pY3xFKWpCwhhqKZFHMYC92aGBIIt2XlXw";
		public String b = "7y9N3G09EqxDblwhHzsv18WU4gzWfiAZw6mMsVWQHltIv3IReRhWQHytdxPD";
		public String c = "Z3YQ2vpG6KUckJ3J7myXnUNNJQsVduanxBRDOwWur7byk9WXLOLIuYbe9AFs";
		public String d = "Aev4ebmDx49CTC5BTiPv8lcCB810KJ1J6SfqDkjG9Ad8caWjYSYCz5ox4J9y";
		public String e = "R4cpubuuuGWKljwil2ro8yt8CAC2zKJeqD120haVTWGng5EB0Eb5uYUzzXKB";
	}

	@Benchmark
	public void plus_2(State2 state, Blackhole blackhole) {
		blackhole.consume(state.a + state.b);
	}

	@Benchmark
	public void plus_3(State3 state, Blackhole blackhole) {
		blackhole.consume(state.a + state.b + state.c);
	}

	@Benchmark
	public void plus_4(State4 state, Blackhole blackhole) {
		blackhole.consume(state.a + state.b + state.c + state.d);
	}

	@Benchmark
	public void plus_5(State5 state, Blackhole blackhole) {
		blackhole.consume(state.a + state.b + state.c + state.d + state.e);
	}

	@Benchmark
	public void stringbuilder_2(State2 state, Blackhole blackhole) {
		blackhole.consume(new StringBuilder().append(state.a).append(state.b).toString());
	}

	@Benchmark
	public void stringbuilder_3(State3 state, Blackhole blackhole) {
		blackhole.consume(new StringBuilder().append(state.a).append(state.b).append(state.c).toString());
	}

	@Benchmark
	public void stringbuilder_4(State4 state, Blackhole blackhole) {
		blackhole.consume(
				new StringBuilder().append(state.a).append(state.b).append(state.c).append(state.d).toString());
	}

	@Benchmark
	public void stringbuilder_5(State5 state, Blackhole blackhole) {
		blackhole.consume(
				new StringBuilder().append(state.a).append(state.b).append(state.c).append(state.d).append(state.e).toString());
	}

	@Benchmark
	public void concat_2(State2 state, Blackhole blackhole) {
		blackhole.consume(state.a.concat(state.b));
	}

	@Benchmark
	public void concat_3(State3 state, Blackhole blackhole) {
		blackhole.consume(state.a.concat(state.b.concat(state.c)));
	}

	@Benchmark
	public void concat_4(State4 state, Blackhole blackhole) {
		blackhole.consume(state.a.concat(state.b.concat(state.c.concat(state.d))));
	}

	@Benchmark
	public void concat_5(State5 state, Blackhole blackhole) {
		blackhole.consume(state.a.concat(state.b.concat(state.c.concat(state.d.concat(state.e)))));
	}

	@Benchmark
	public void format_2(State2 state, Blackhole blackhole) {
		blackhole.consume(String.format("%s%s", state.a, state.b));
	}

	@Benchmark
	public void format_3(State3 state, Blackhole blackhole) {
		blackhole.consume(String.format("%s%s%s", state.a, state.b, state.c));
	}

	@Benchmark
	public void format_4(State4 state, Blackhole blackhole) {
		blackhole.consume(String.format("%s%s%s%s", state.a, state.b, state.c, state.d));
	}

	@Benchmark
	public void format_5(State5 state, Blackhole blackhole) {
		blackhole.consume(String.format("%s%s%s%s%s", state.a, state.b, state.c, state.d, state.e));
	}
	
	@Benchmark
	public void slf4j_2(State2 state, Blackhole blackhole) {
		blackhole.consume(MessageFormatter.format("{}{}", state.a, state.b).getMessage());
	}
	
	@Benchmark
	public void slf4j_3(State3 state, Blackhole blackhole) {
		blackhole.consume(MessageFormatter.arrayFormat("{}{}{}", new Object[] { state.a, state.b, state.c }).getMessage());
	}
	
	@Benchmark
	public void slf4j_4(State4 state, Blackhole blackhole) {
		blackhole.consume(MessageFormatter.arrayFormat("{}{}{}{}", new Object[] { state.a, state.b, state.c, state.d }).getMessage());
	}
	
	@Benchmark
	public void slf4j_5(State5 state, Blackhole blackhole) {
		blackhole.consume(MessageFormatter.arrayFormat("{}{}{}{}{}", new Object[] { state.a, state.b, state.c, state.d, state.e }).getMessage());
	}

}
