def main ( * argv ) :
    import os
    import sys
    import abs
    import min
    class Main ( object ) :
        def __init__ ( self , * argv ) :
            sc = sys.stdin
            n = sc.readline ( )
            for c in n :
                if c == '9' :
                    print ( 'Yes' )
                    return
            print ( 'No' )
    return Main
