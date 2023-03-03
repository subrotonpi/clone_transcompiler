def Train ( cars ) :
    MOD = 1_000_000_007
    def calc ( cars ) :
        result = 1
        n = len ( cars )
        for ch in [ 'a' , 'z' ] :
            solocount = 0
            start = - 1
            mid = - 1
            end = - 1
            solo = - 1
            for i in range ( n ) :
                if cars [ i ] is None :
                    pass
                elif re.match ( " % s + ' % ch , cars [ i ] ) :
                    solocount += 1
                    result *= solocount
                    result %= MOD
                    cars [ i ] = None
                    solo = i
                elif re.match ( "%s+[^%s]+" % ( ch , ch ) , cars [ i ] ) :
                    if start != - 1 :
                        return 0
                    start = i
                elif re.match ( "%s+[^%s]+" % ( ch , ch ) , cars [ i ] ) :
                    if end != - 1 :
                        return 0
                    end = i
                elif re.match ( "%s+[^%s]+" % ( ch , ch ) , cars [ i ] ) :
                    if mid != - 1 :
                        return 0
                    mid = i
                elif re.match ( "%s+[^%s]+" % ( ch , ch ) , cars [ i ] ) :
                    pass
                else :
                    return 0
            if mid == - 1 and solocount == 0 and start == - 1 and end == - 1 :
                continue
            if mid != - 1 and ( solocount > 0 or start != - 1 or end != - 1 ) :
                return 0
            if mid != - 1 :
                continue
            repl = ""
            if end != - 1 :
                repl += cars [ end ]
                cars [ end ] = None
            if solo != - 1 :
                repl += ch
            if start != - 1 :
                repl += cars [ start ]
                cars [ start ] = None
            if solo != - 1 :
                cars [ solo ] = repl
        return result
    return calc
