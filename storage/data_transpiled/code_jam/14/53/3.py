def contest ( ) :
    import os
    import sys
    import random
    import sys
    import os
    import sys
    import random
    class CrimeHouse ( ) :
        PROBLEM_NAME = 'crime'
        case_cnt = random.randint ( 1 , 2001 )
        for case_num in range ( case_cnt ) :
            print ( 'Processing test case ' + str ( case_num ) + '\'' )
            print ( 'Case #' + str ( case_num ) + ': ' , end = '' )
            CrimeHouse ( ).solve ( sc , file = f )
    random.seed ( 1 )
    N = len ( sys.stdin.readline ( ) )
    event_type = [ ]
    id = [ ]
    recode = [ ]
    next_id = 0
    recode.append ( - 1 )
    for i in range ( N ) :
        event_type.append ( sc.readline ( ) [ 0 ] )
        who = sc.readline ( ) [ 1 ]
        if who == 0 :
            id.append ( - 1 )
            continue
        if recode [ who ] == - 1 :
            recode [ who ] = next_id
            next_id += 1
        id.append ( recode [ who ] )
    can = [ [ True for mask in range ( 1 , N + 1 ) ] for pos in range ( N ) ]
    for e in event_type :
        who = id [ pos ]
        for mask in range ( 1 , N + 1 ) :
            if not can [ pos ] [ mask ] :
                continue
            if e == 'E' :
                for i in range ( N ) :
                    if ( who == - 1 or who == i ) and ( mask & ( 1 << i ) ) == 0 :
                        can [ pos + 1 ] [ mask ^ ( 1 << i ) ] = True
            else :
                for i in range ( N ) :
                    if ( who == - 1 or who == i ) and ( mask & ( 1 << i ) ) != 0 :
                        can [ pos + 1 ] [ mask ^ ( 1 << i ) ] = True
    ans = N + 1
    for mask in can :
        ans = min ( ans , int ( mask ) )
        if ans == ans :
            print