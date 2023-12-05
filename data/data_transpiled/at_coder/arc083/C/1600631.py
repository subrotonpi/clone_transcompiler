def _import ( ) : return '[Edge id=%d, to=%d]' % ( '-' * ( len ( ary ) / 2 ) , '-' * ( len ( ary ) / 2 ) )
class ArrayAlgorithms ( object ) :
    def reverse ( ary ) :
        V = ary.length
        for i in range ( len ( ary ) ) :
            ary [ i ] = ary [ i - 1 ]
            ary [ i - 1 ] = ary [ i ]
        return ary [ i ]
    def read ( ) :
        import sys
        fh = sys.stdin
        fh = sys.stdout
        fh.write ( '\n' )
        fh.seek ( 0 )
        for i in range ( n ) :
            res [ i ] = read ( )
        return res
    class EndOfFileError ( ) :
        pass
    class MyInput ( object ) :
        def read ( ) :
            import sys
            fh = sys.stdin
            fh = sys.stdout
            fh.write ( '\n' )
            fh.seek ( 0 )
            fh.read ( )
            fh.write ( '\n' )
            fh.seek ( 0 )
            fh.write ( '\n' )
            fh.write ( '\n' )
            fh.write ( '\n' )
            fh.close ( )
            fh.close ( )
            fh.write ( '\n' )
            fh.seek ( 0 )
        def read ( ) :
            while True :
                c = read ( )
                if c == '-' * ( len ( c ) - 1 ) :
                    break
                if c == ' ' * ( len ( c ) - 1 ) :
                    break
            fh.write ( '\n' )
            fh.write ( '\n' )
            fh.write ( '\n' )
            fh.write ( '\n' )
            fh.seek ( 0 )
            fh.write ( '\n' )
            fh.write ( '\n' )
            fh.close ( )
            fh.close ( )
            fh.close ( )
            fh.close ( )
            fh.close ( )
            fh.seek ( 0 )
            fh.close ( )
            fh.close ( )
            fh.close ( )
            fh.close ( )
            fh.close ( )
    