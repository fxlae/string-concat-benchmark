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
		public String a = "kRP9bXnzgc9yXdQjYFE8yiVaXSXsPoXVFXHhrPzatmTgBhI448IDyMjtS1qBqjD7";
		public String b = "BG0aDM09HfIojNrpvGOYZW40Zko18rqjhVbOAw0xrYa89NwUHPEjNWyPLvdo1olL";
	}

	@State(Scope.Thread)
	public static class State3 {
		public String a = "20VxfzFIrkq8fxBoBUop9uDXSijcP4FoQutnVKEW7QXY5CYMPlQ3LQ5HeXaHawtD";
		public String b = "UfcnR71EIzbDGxc8LL77THFkipRjiih43DNjNXtPMVNu8XEa4yAVR3wzrcoy1awJ";
		public String c = "8N8Po1m87nS96oHPZZQiFW8GJZqCoTUYroKMHmcVG9BoBM9ogN4fwn3PePHXOg3V";
	}

	@State(Scope.Thread)
	public static class State4 {
		public String a = "TFNUMAgs916m5ftddj7xLMS8E5cSPaGlMLyvXOQIZKJ21Ph4sc3Q04d7Qlwddrxq";
		public String b = "c1M0ZQrX7ZKB9FMHcipORhtOjvpH2fUipZU5ZFsDbFmaPiImmbj7sJKt1j2bOKWR";
		public String c = "VixlaqqiKBMZYPT2Yv2xRzIHi2Cg0vnumhl2h23SyO4TAoP7mm2yELuQuInvIL2G";
		public String d = "95yvVsvALYB4N1GGeM42GJK2Xn7DjOWak4Z6keIUdB5NTZYELYJRcQUkyKECoDkz";
	}

	@State(Scope.Thread)
	public static class State5 {
		public String a = "6P4lWigDgOPf8X0owCUHYC5md6tazZZOWdzcQwXzJ6tkeC4T0aFjrMNc8B2mWuue";
		public String b = "Zl6VXLxufotAeU4uKkFjZnUC6p7cMtenij5aFfJJNC3AbItFT2tuvVhMqblPRc65";
		public String c = "SDzixApZlZDWzSlz15kk1Iy8FAHXYgAku2WlfS82iAmEAS9NmAfeo2VbrDUSHYEX";
		public String d = "MgCBmB6nzNy7vTaEimkgL4l5aGC8B4X1hDGEJEfZLRlBmXCG16zItsUdssKzxfsp";
		public String e = "qFtvjumn5EzR6cYPy7EyHK5qyfFUgncURovejsjkHbYyFEDgNs3yJiBgfvjmId0E";
	}
	
	@State(Scope.Thread)
	public static class State10 {
		public String a = "FzyN6BBYeYa8WKy7WWupu1agZFzvV7udM1ZnXc9SwnjwPtoUNRZ6uvF2wSGLKg6e";
		public String b = "ZjOSmqZGOqQ73wgPz5tFLIv37aAdDXoi1wpdCt9qHfUTiQfZ4xNP62unbilxhDse";
		public String c = "g7Upo0Jh5G1L1VqcIFOneN1oeXoTfH6f6y8SwAQSNzO5nNk7BJh16UPjpyUA4ZVI";
		public String d = "EuWXcgRFNmrvex5YKy7VfTnCN8RpTXud74yPdpDNnnbPZaV6cz5Hj8JxwmRw6bcM";
		public String e = "NmTHM7a0ND4YUUHxgUTO3svXDTePyWvyAOhmkiHu7YIRojZNCNdgZaBGiQeHujo3";
		public String f = "WpsgZriBGlVVTGHT9aFZzltJMcjtNY5dQplnuM4BDhywqGisUfKE0HAo28pnHvwF";
		public String g = "xtU9iRThHGVFO1hjjupkppGowz9VVUOutVcwOWbMqsmP8Emc76sQgTGPiRbcrUOs";
		public String h = "zAAgnLseCAcQVdO7ZUmOoyb8zy6Gg4W2uAhUtbPCRrVM9syQOXDbNGQ8CqLTwYS6";
		public String i = "kyXXlGW2gJI3xi0vP3TboXuU8jXWWpAWPSqDufSmfDJoY5s3bXkUFbYWjfcnfwiE";
		public String j = "IC1dN1z6erMqXYvVb13Q72eSe32ZVBDrwEv1EKZbx6OgWDP6elMX0L9vkRd2dxUr";
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
	public void plus_10(State10 state, Blackhole blackhole) {
		blackhole.consume(state.a + state.b + state.c + state.d + state.e + state.f + state.g + state.h + state.i + state.j);
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
	public void stringbuilder_10(State10 state, Blackhole blackhole) {
		blackhole.consume(
				new StringBuilder().append(state.a).append(state.b).append(state.c).append(state.d).append(state.e).append(state.f).append(state.g).append(state.h).append(state.i).append(state.j).toString());
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
	public void concat_10(State10 state, Blackhole blackhole) {
		blackhole.consume(state.a.concat(state.b.concat(state.c.concat(state.d.concat(state.e.concat(state.f.concat(state.g.concat(state.h.concat(state.i.concat(state.j))))))))));
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
	public void format_10(State10 state, Blackhole blackhole) {
		blackhole.consume(String.format("%s%s%s%s%s%s%s%s%s%s", state.a, state.b, state.c, state.d, state.e, state.f, state.g, state.h, state.i, state.j));
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
	
	@Benchmark
	public void slf4j_10(State10 state, Blackhole blackhole) {
		blackhole.consume(MessageFormatter.arrayFormat("{}{}{}{}{}{}{}{}{}{}", new Object[] { state.a, state.b, state.c, state.d, state.e, state.f, state.g, state.h, state.i, state.j }).getMessage());
	}

}
