def import _solve
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def solve ( self ) :
        sc = _raw_input ( )
        n = sc.__next__ ( )
        a = [ 0 ]
        for i in range ( 1 , n ) :
            a.append ( sc.__next__ ( ) )
        sc.close ( )
        win = [ [ ] for i in range ( n ) ]
        for i in range ( 1 , n ) :
            win [ a [ i ] - 1 ].append ( i )
        self.dp = [ ]
        solve ( 0 )
        print ( self.dp [ 0 ] - 1 )
    def solve ( self ) :
        size = len ( win )
        if size == 0 :
            self.dp.append ( 1 )
            return
        d = [ ]
        for t in win :
            solve ( t )
            d.append ( t )
        d.reverse ( )
    return
