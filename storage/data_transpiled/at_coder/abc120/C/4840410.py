def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
        def __call__ ( self , * args ) :
            return self.S
    S = Main ( )
    cnt = 0
    for c in S :
        if c == '1' :
            cnt += 1
    print ( min ( cnt , len ( S ) - cnt ) * 2 )
