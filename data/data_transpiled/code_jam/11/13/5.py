def r1a ( ) :
    import random
    class C ( object ) :
        def __init__ ( self , c , s , t ) :
            self.c = c
            self.s = s
            self.t = t
    def score ( cards , N , draw ) :
        turn = 1
        used = [ ]
        hand = N
        nd = 0
        score = 0
        while turn > 0 :
            select = ( 0 , 0 , 0 )
            si = - 1
            for i in range ( hand ) :
                if used [ i ] :
                    continue
                ci = cards [ i ]
                if ci.t > 0 :
                    select = ci
                    si = i
                    break
                else :
                    if nd < draw :
                        if select.c == 0 and ci.c == 1 :
                            select = ci
                            si = i
                        elif select.c == ci.c :
                            if select.s < ci.s :
                                select = ci
                                si = i
                    else :
                        if select.s < ci.s :
                            select = ci
                            si = i
            if si < 0 :
                break
            used.append ( si )
            turn += select.t
            hand = min ( len ( cards ) , hand + select.c )
            nd += select.c
            score += select.s
            turn -= 1
        return score
    def main ( ) :
        with open ( "/proc/stdin/stdout" , "r" ) as sc :
            T = sc.read ( )
            for cn in range ( 1 , T + 1 ) :
                N = sc.read ( )
                cards = [ ]
                for i in range ( N ) :
                    c = Card ( sc.read ( ) , sc.read ( ) , sc.read ( ) )
                    cards.append ( c )
                M = sc.read ( )
                for i in range ( M ) :
                    c = Card ( sc.read ( ) , sc.read ( ) , sc.read ( ) )
                    cards.append ( c )
                ms = 0
                cs = cards [ : ]
                for i in range ( 0 , M + 1 ) :
                    c = Card ( sc.read ( ) , sc.read ( ) , sc.read ( )