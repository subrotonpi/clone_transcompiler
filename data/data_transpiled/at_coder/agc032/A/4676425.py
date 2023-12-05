def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.num = int ( sys.argv [ 1 ] )
            self.ans = [ - 1 ] * num
        def __call__ ( self , * args ) :
            self.ans = [ ]
    ok = True
    for i in range ( num ) :
        tmp = sys.argv [ i ]
        if tmp > 1 :
            if ans [ tmp - 2 ] < 0 :
                ok = False
                break
        for j in range ( num - 1 , - tmp , - 1 ) :
            ans [ j ] = ans [ j - 1 ]
        ans [ tmp - 1 ] = tmp
    if ok :
        for i in range ( num ) :
            print ( ans [ i ] )
    else :
        print ( - 1 )
