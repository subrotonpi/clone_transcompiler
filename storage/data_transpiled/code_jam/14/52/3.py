def contest ( ) :
    import os
    import sys
    import random
    import sys
    class LastHit ( object ) :
        PROBLEM_NAME = 'lasthit'
        WORK_DIR = r'D:\GCJ\\'+PROBLEM_NAME+' \ \'
        P , Q , N = [ ] , [ ] , [ ]
        for i in range ( N ) :
            H.append ( i )
            G.append ( i )
    def rec ( who , choose_free , pos , HP , free ) :
        if pos == N :
            return 0 if free == 0 else - 500000000
        if memo [ who ] [ choose_free ] [ pos ] [ HP ] [ free ] != - 1000000000 :
            return memo [ who ] [ choose_free ] [ pos ] [ HP ] [ free ]
        ans = - 1000000000
        if who == 0 :
            if choose_free > 0 :
                if free > 0 :
                    if HP > P :
                        ans = max ( ans , rec ( who , choose_free , pos , HP - P , free - 1 ) )
                    else :
                        ans = max ( ans , rec ( who , choose_free , pos + 1 , - 1 if pos == N - 1 else H [ pos + 1 ] , free - 1 ) + G [ pos ] )
                if choose_free == 1 :
                    ans = max ( ans , rec ( 0 , 0 , pos , HP , free ) )
                else :
                    ans = max ( ans , rec ( 1 , 0 , pos , HP , free ) )
            else :
                ans = max ( ans , rec ( 1 - who , 0 , pos , HP , free ) )
                if HP > P :
                    ans = max ( ans , rec ( 1 - who , 0 , pos , HP - P , free ) )
                else :
                    ans = max ( ans , rec ( who , 2 , pos + 1 if pos == N - 1 else H [ pos + 1 ] , free ) + G [ pos ] )
                if free + 1 < 5 * N + 5 :
                    ans = max ( ans , rec ( 1 - who , 0 , pos , HP , free + 1 ) )
        else :
            ans = rec ( 1 - who , 0 , pos , HP , free )