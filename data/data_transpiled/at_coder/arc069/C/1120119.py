def main ( ) :
    from random import randint
    from itertools import chain
    from random import randint
    from sys import stdin
    io = stdin
    N = randint ( 1 , N )
    ans = [ 0 ] * N
    que = [ ]
    for i in range ( 1 , N + 1 ) :
        que.append ( ( i , io.read ( ) ) )
    que.append ( ( 0 , 0 ) )
    if not que :
        return ans
    now_deck = next ( iter ( que ) )
    now_no = randint ( 1 , N )
    now_num = randint ( 1 , N )
    for i in range ( 1 , N + 1 ) :
        now_deck = que.pop ( )
        now_no = min ( now_no , now_deck.NO )
        ans [ now_no - 1 ] += randint ( 1 , N )
    for i in range ( N ) :
        print ( ans [ i ] )
    class Deck ( object ) :
        def __init__ ( self , NO , num ) :
            self.NO = NO
            self.num = num
        def __call__ ( self , o ) :
            return ( o.NO - self.num , o.num )
        def __call__ ( self , o ) :
            return ( o.NO - self.num , o.num )
    return Deck
