def code_pyam2015 ( ) :
    import time
    class C ( ) :
        def __init__ ( self ) :
            self.T = 1
            for cases in range ( 1 , T + 1 ) :
                L = self.T
                X = self.X
                s = self.s
                if L == 1 :
                    print ( "Case #%d: NO" % cases )
                    continue
                j = 0
                i = 0
                accum = 1
                matchedi = False
                time = time.time ( )
                matchi :
                    for j in range ( X ) :
                        for i in range ( len ( s ) ) :
                            accum = quartenion ( accum , s [ i ] )
                            if accum == 2 :
                                matchedi = True
                                break
                        if time.time ( ) - time.time ( ) > 1000 :
                            break
                    if not matchedi :
                        print ( "Case #%d: NO" % cases )
                        continue
                    i += 1
                    accum = 1
                    matchedj = False
                    matchj :
                    for j in range ( X ) :
                        for i in range ( len ( s ) ) :
                            accum = quartenion ( accum , s [ i ] )
                            if accum == 3 :
                                matchedj = True
                                break
                        i = 0
                    if not matchedj :
                        print ( "Case #%d: NO" % cases )
                        continue
                    i += 1
                    accum = 1
                    for i in range ( len ( s ) ) :
                        accum = quartenion ( accum , s [ i ] )
                        if accum == 4 :
                            matchedk = True
                            break
                    i = 0
                if not matchedk :
                    print ( "Case #%d: NO" % cases )
                    continue
                i += 1
                accum = 1
                for i in range ( len ( s ) ) :
                    accum = quartenion ( accum , s [ i ] )
                    if accum == 1 :
                        break
                if i == 0 :
                    return - 1
        return C ( )
    