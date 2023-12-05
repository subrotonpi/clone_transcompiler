def ones ( n ) :
    import math
    class Main ( object ) :
        def __init__ ( self , n ) :
            self.c = 0
            while n > 0 :
                if n % 10 == 1 :
                    c += 1
                n //= 10
        def f ( self , n ) :
            if n <= 0 :
                return 0
            total = 0
            r = n % 10
            if r >= 2 :
                total += 1
            total += 10 * f ( n / 10 )
            total += n / 10
            return total + ones ( n / 10 ) * r
    def main ( ) :
        with open ( "/proc/main.txt" , "r" ) as f :
            n = f.read ( )
            print ( f ( n + 1 ) )
    return Main ( )
