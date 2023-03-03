def test_import ( ) :
    from pybind11_tests import Scanner
    class D ( Scanner ) :
        def __init__ ( self ) :
            sc = Scanner ( )
            t = sc.__next__ ( )
            for i in range ( t ) :
                print ( "Case #%d: %s\n" % ( i + 1 , self.exec ( ) ) )
        def execute ( self ) :
            n = sc.__next__ ( )
            count = 0
            for i in range ( n ) :
                if sc.__next__ ( ) != i + 1 :
                    count += 1
            return str ( count )
    return D ( )
