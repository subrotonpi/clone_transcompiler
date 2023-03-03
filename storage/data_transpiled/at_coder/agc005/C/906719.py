def main ( ) :
    import sys
    from random import randint
    from string import ascii_lowercase
    from string import ascii_lowercase
    from string import digits
    N = randint ( 1 , N )
    a = [ ]
    cnt = { }
    min = N + 1
    max = 0
    for i in range ( N ) :
        a.append ( ascii_lowercase.join ( digits ) )
        cnt [ a [ i ] ] += 1
        min = min ( min , a [ i ] )
        max = max ( max , a [ i ] )
    sys.stdout.write ( "\n" )
    POSSIBLE = "Possible"
    IMPOSSIBLE = "Impossible"
    ans = POSSIBLE
    if cnt [ min ] == 1 :
        if max == min * 2 :
            ans = POSSIBLE
            for i in range ( min + 1 , max + 1 ) :
                if cnt [ i ] < 2 :
                    ans = IMPOSSIBLE
                    break
        else :
            ans = IMPOSSIBLE
    elif cnt [ min ] == 2 :
        if max == min * 2 - 1 :
            ans = POSSIBLE
            for i in range ( min + 1 , max + 1 ) :
                if cnt [ i ] < 2 :
                    ans = IMPOSSIBLE
                    break
        else :
            ans = IMPOSSIBLE
    else :
        ans = IMPOSSIBLE
    print ( ans )
