def main ( ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.A = A
        def __call__ ( self , * args , ** kwargs ) :
            sc = sys.stdin
            s1 = sc.read ( )
            s2 = sc.read ( )
            if s1 < s2 :
                print ( '<' )
            elif s1 == s2 :
                print ( '=' )
            else :
                print ( '>' )
    return A ( )
