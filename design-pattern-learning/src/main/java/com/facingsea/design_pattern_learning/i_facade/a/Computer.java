package com.facingsea.design_pattern_learning.i_facade.a;

/**
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
 * 而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
 * @author wangzhf
 *
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup(){
		System.out.println("the computer will startup ... ");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("the computer startup over .");
	}
	
	public void shutdown(){
		System.out.println("the computer will shutdown ...");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("the computer shutdown over .");
	}
}
