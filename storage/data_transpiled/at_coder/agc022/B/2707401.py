def main ( ) :
    import sys
    from itertools import count
    sc = sys.stdin
    N = sc.count ( )
    ans = set ( )
    if N == 3 :
        print ( '2 3 25' )
    elif N == 4 :
        print ( '2 3 5 20' )
    elif N == 5 :
        print ( '2 3 4 5 16' )
    else :
        ans.add ( 2 )
        ans.add ( 3 )
        sum = 5
        for i in range ( 4 ) :
            if i % 2 == 0 or i % 3 == 0 :
                ans.add ( i )
                sum += i
                last_ans = i
                if len ( ans ) == N :
                    break
        if sum % 6 == 0 :
            pass
        elif sum % 6 == 2 :
            ans.discard ( 8 )
            for i in range ( last_ans + 1 ) :
                if i % 6 == 0 :
                    ans.add ( i )
                    break
        elif sum % 6 == 3 :
            ans.discard ( 9 )
            for i in range ( last_ans + 1 ) :
                if i % 6 == 0 :
                    ans.add ( i )
                    break
        else :
            ans.discard ( 9 )
            for i in range ( last_ans + 1 ) :
                if i % 6 == 4 :
                    ans.add ( i )
                    break
        for an in ans :
            print ( an , end = ' ' )
