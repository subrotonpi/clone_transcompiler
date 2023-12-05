def _ ( ) : return int ( s.readline ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
    def getInt ( self ) : return int ( self.s.readline ( ) )
    def REPS ( self , v ) : return self.s.read ( )
    def REPS ( self , l , r ) : return self.s.read ( )
    def INS ( self , n ) : return self.REPS ( n ).map ( i )
class Pair ( T , U ) :
    def __init__ ( self ) :
        self.l = L
        self.r = R
    def getL ( self ) : return self.l
    def getR ( self ) : return self.r
a , b , c = ( 1 , 0 ) , ( 0 , 1 ) , ( 0 , 2 )
def main ( $ ) :
    d , t = 1 , 0
    while 1 :
        if f ( d + t ) < 100 :
            t += d
        else :
            d //= 10
        if abs ( f ( t ) - 100 ) <= 0.000001 :
            break
    print ( t )
def f ( t ) :
    return t * a + math.sin ( t * c * math.pi ) * b
