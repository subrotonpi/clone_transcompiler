def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = 0
        self.b = 0
    def main ( self ) :
        sc = _main.raw_input ( )
        n = sc.number
        lst = [ ]
        if n % 2 == 0 :
            for i in range ( 1 , n // 2 ) :
                lst.append ( ( i , i + 1 ) )
                lst.append ( ( i , n - i ) )
                lst.append ( ( i + 1 , n - i + 1 ) )
                lst.append ( ( n - i , n - i + 1 ) )
            if n > 4 :
                lst.append ( ( 1 , n // 2 ) )
                lst.append ( ( n // 2 , n ) )
                lst.append ( ( 1 , n // 2 + 1 ) )
                lst.append ( ( n // 2 + 1 , n ) )
        else :
            for i in range ( 1 , n // 2 ) :
                lst.append ( ( i , i + 1 ) )
                lst.append ( ( i , n - i - 1 ) )
                lst.append ( ( i + 1 , n - i ) )
                lst.append ( ( n - i - 1 , n - i ) )
            lst.append ( ( n // 2 , n ) )
            lst.append ( ( n // 2 + 1 , n ) )
            if n > 3 :
                lst.append ( ( 1 , n ) )
                lst.append ( ( n - 1 , n ) )
        lst.sort ( key = lambda p1 : p1.a , reverse = True )
        lines = [ "%d\n" % len ( lst ) ]
        for p in lst :
            lines.append ( "%s %d\n" % ( p.a , p.b ) )
        print ( "\n".join ( lines ) , end = "" )
