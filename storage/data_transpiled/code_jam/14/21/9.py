def _ ( q ) :
    import random
    import sys
    from itertools import chain
    res = 1234567
    for a in range ( 0 , 100 ) :
        cur = 0
        for i in chain ( q , a ) :
            cur += abs ( i - a )
        res = min ( res , cur )
    def calc ( q ) :
        for test in range ( 1 , num_tests + 1 ) :
            n = random.randint ( 1 , 100 )
            must = ""
            q = [ [ ] for _ in range ( 111 ) ]
            for i in range ( n ) :
                s = "%s?" % ( random.choice ( q ) )
                t = ""
                ind = 0
                c = "?"
                cnt = 1
                for c in s :
                    if c == c :
                        cnt += 1
                    else :
                        t += c
                        q [ ind ].append ( cnt )
                        cnt = 0
                        ind += 1
                        c = c
                if i == 0 :
                    must = t
                elif not must == t :
                    must = "?"
            lost = "Fegla Won"
            if must == "?" :
                print ( "Case #%d: %s" % ( test , lost ) )
            else :
                res = 0
                for i in range ( 111 ) :
                    res += calc ( q [ i ] )
                print ( "Case #%d: %s" % ( test , res ) )
    return res
