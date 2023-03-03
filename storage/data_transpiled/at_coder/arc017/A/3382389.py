def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.N , self.i = self.sc.read ( ) , self.sc.close ( )
    for i in range ( 2 , int ( math.sqrt ( N ) ) + 1 ) :
        if N % i == 0 :
            break
    if i == int ( math.sqrt ( N ) ) + 1 :
        print ( "YES" )
    else :
        print ( "NO" )
