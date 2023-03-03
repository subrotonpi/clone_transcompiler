def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.m = int ( sys.argv [ 1 ] )
        def readline ( self ) :
            return sys.stdin.readline ( ).strip ( )
    m = int ( sys.argv [ 1 ] )
    if 70000 < m :
        print ( '89' )
    elif 35000 <= m <= 70000 :
        print ( ( m / 1000 - 30 ) / 5 + 80 )
    elif 6000 <= m <= 30000 :
        print ( m / 1000 + 50 )
    elif 100 <= m <= 5000 :
        print ( '%02d\n' % ( m / 100 ) )
    elif m < 100 :
        print ( '00' )
