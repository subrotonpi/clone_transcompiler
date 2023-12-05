def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.__main__ = sys.argv [ 0 ]
    sc = Main ( )
    str = sc.read ( )
    if len ( str ) % 2 != 0 :
        print ( "No" )
        sys.exit ( )
    while 1 :
        tmp = str.replace ( str [ 0 ] , "" )
        if ( len ( str ) - len ( tmp ) ) % 2 != 0 :
            print ( "No" )
            sys.exit ( )
        elif len ( tmp ) == 0 :
            print ( "Yes" )
            sys.exit ( )
        str = tmp
