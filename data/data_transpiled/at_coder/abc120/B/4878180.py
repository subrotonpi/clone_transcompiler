def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A , self.B , self.K = sys.stdin.read ( ).split ( '\n' )
        def gcd ( self , a , b ) :
            self.A , self.B , self.K = a , b , a
            n , count , num = gcd ( self , A , B )
            while count < K :
                if n % num == 0 :
                    count += 1
            print ( n / num )
        def gcd ( self , a , b ) :
            if a > b :
                c , a , b = a , b , c
            while ( b % a ) :
                b , a , a = b , a , r
            return a
    return Main ( )
