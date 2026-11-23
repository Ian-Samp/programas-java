2 Considere os métodos abaixo. Indique se está sendo utilizada sobrecarga de método
ou sobrescrita. Explique e diga com que outro método esta sendo realizada a sobrecarga
ou sobrescrita (se for o caso).
```
public class A {
...
public A() { ... }
public A( int x ) { ... }
public void m1() { ... }
public void m1( int h ) { ... }
}
public class B extends A {
...
public B() { ... }
public void m1() { ... }
public void m1( double x, double y ) { ... }
public void m2() { ... }
}
```

2.1 Quais métodos realizam sobrescrita? Por quê?  
    Resposta:  
- B.m1() sobrescreve A.m1(), pois B herda A e define um método idêntico ao de A.

2.2 Quais métodos realizam sobrecarga? Por quê?  
    Resposta:  
- Métodos que possuem o mesmo nome mas com parâmetros diferentes (sobrecarga):  
- A.m1 e A.m1(int h),   
- A() e A(int x),  
- B.m1 (double x, double y), B.m1(), A.m1(int h) e A.m1().
