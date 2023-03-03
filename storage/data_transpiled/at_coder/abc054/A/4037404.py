def main ( ) :
    import sys
    from pybind11_tests import main as main
    class Main ( object ) :
        def __init__ ( self ) :
            pass
        def __call__ ( self , * args , ** kwargs ) :
            a = args [ 0 ]
            b = args [ 1 ]
            if a == b :
                print ( "Draw" )
                return
            if a == 1 or ( b != 1 and a > b ) :
                print ( "Alice" )
                return
            print ( "Bob" )
    main ( )
