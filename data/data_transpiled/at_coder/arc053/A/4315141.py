def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __call__ ( self , * args ) :
        sc = sys.stdin
        h = sc.recv_recv_exit_status ( )
        w = sc.recv_recv_exit_status ( )
        ans = 0
        if h >= 2 :
            ans += ( h - 1 ) * w
        if w >= 2 :
            ans += ( w - 1 ) * h
        print ( ans )
