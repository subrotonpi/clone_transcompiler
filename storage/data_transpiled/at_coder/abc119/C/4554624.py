def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.A , self.B , self.C = _main.get ( self.N )
        self.min = 2000000000
    def f ( self , n , a , b , c , cost ) :
        self.n = n
        self.a = a
        self.b = b
        self.c = c
        self.cost = cost
        self.f ( 0 , 0 , 0 , 0 , 0 )
        print ( self.min )
    def f ( self , n , a , b , c , cost ) :
        if n == self.N :
            if a == 0 or b == 0 or c == 0 :
                return
            else :
                cost += abs ( A - a ) + abs ( B - b ) + abs ( C - c ) - 30
                self.min = min ( self.cost )
                return
        self.f ( n + 1 , a , b , c , cost )
        self.f ( n + 1 , a + self.l [ n ] , b , c , cost + 10 )
        self.f ( n + 1 , a , b + self.l [ n ] , c , cost + 10 )
        self.f ( n + 1 , a , b , c + self.l [ n ] , cost + 10 )
