def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            sc = sys.stdin
            s = sc.read ( )
            sc.close ( )
            S = s.split ( '' )
            count = 0
            for i in S :
                if i == '1' :
                    count += 1
            print ( count )
