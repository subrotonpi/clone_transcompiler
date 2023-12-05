def _ import _ , os , sys , stream , ms ) :
    from random import randint , randrange
    class Main ( object ) :
        def solve ( self , stream , ms ) :
            a = stream.read ( 1024 )
            n = len ( a )
            b = True
            for i in range ( n // 2 ) :
                if a [ i ] == '*' or a [ n - i - 1 ] == '*' :
                    raise ValueError
                n = 0
                while is_printable ( temp ) :
                    if '0' <= temp <= '9' :
                        n += temp - '0'
                    else :
                        n += 1
                elif not is_printable ( temp ) :
                    return - n if n <= 126 else n
            def skip ( ) :
                while is_printable ( temp ) :
                    n += 1
            def next ( ) :
                if not is_printable ( temp ) :
                    raise StopIteration
                yield ''
        def main ( self ) :
            self.main = Main ( )
            f = FastScanner ( sys.stdin )
            f = open ( sys.stdout , 'w' )
            ms = Methods ( )
            self.solve ( f , f , ms )
            f.close ( )
            f.close ( )
    class Methods ( object ) :
        def print ( self , * ar ) :
            print ( ''.join ( ar ) )
        def yesno ( self , b ) :
            print ( b and 'Yes' or 'No' )
        def YESNO ( self , b ) :
            print ( b and 'YES' or 'NO' )
        def max ( self , * ar ) :
            self.max = max ( self , * ar )
            return self.min
        def manhat ( self , x1 , y1 , x2 , y2 ) :
            d = abs ( x1 - x2 ) + abs ( y1 - y2 )
            return d
        def euclid ( self , x1 , y1 , x2 , y2 ) :
            d = sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
            return d
        def isPrime ( self , n ) :
            if n == 2 :
                return True
            if n % 2 == 0 :
                return False
            