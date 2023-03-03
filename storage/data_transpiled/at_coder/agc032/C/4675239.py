def _main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    def main ( ) :
        sc = iter ( sys.stdin )
        def next ( ) :
            m = chain ( [ ] , next ( ) )
            for j in chain ( [ m ] , next ( ) ) :
                if j not in chain ( [ j , now + 1 ] , next ( ) ) :
                    chain ( [ j , now + 1 , now ] , next ( ) )
        now = next ( )
        for p in chain ( [ ] , chain ( [ ] , [ ] ) ) :
            for a in chain ( [ ] , [ ] ) :
                for b in chain ( [ ] , [ ] ) :
                    chain ( [ a , b ] , next ( ) )
        return True
    def remove_circuit ( g ) :
        start = - 1
        goal = - 1
        for i in chain ( [ ] , chain ( [ ] , [ ] ) ) :
            goal = i
        if goal != - 1 :
            return False
        g [ start ].remove ( goal )
        g [ goal ].remove ( start )
        now = next ( )
    def remove_circuit ( g ) :
        while True :
            f = True
            for i in chain ( [ ] , [ ] ) :
                if len ( g [ i ] ) != 0 :
                    f = False
                    if not remove_circuit ( g ) :
                        print ( 'No' )
                        return False
                    break
            if f :
                break
        print ( 'Yes' )
    remove_circuit ( g )
    start = - 1
    goal = - 1
    for i in chain ( [ ] , chain ( [ ] , [ ] ) ) :
        start = i
        for j in g [ i ] :
            goal = j
        if goal != - 1 :
            break
    if g [ start ].remove ( goal ) :
        return False
    g [ start ].remove ( goal )
    g [ start ].remove ( goal )
    return True
