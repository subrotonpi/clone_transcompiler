def main ( ) :
    import sys
    from pybind11_tests import main as main
    class Main ( object ) :
        def __init__ ( self ) :
            pass
    N = main.count ( )
    name = None
    if N <= 999 :
        name = "ABC"
    else :
        name = "ABD"
    print ( name )
