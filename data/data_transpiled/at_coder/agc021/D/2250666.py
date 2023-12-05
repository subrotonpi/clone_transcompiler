def Main ( ) :
    global dp
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global s
    global t
    if s [ i ] > s [ j ] :
        ans = 0
    elif s [ i ] == s [ j ] :
        ans = 1
    elif s [ i ] == s [ j ] :
        ans = solve ( i + 1 , j - 1 , k ) + 2
    else :
        ans = solve ( i + 1 , j , k )
        ans = max ( ans , solve ( i , j - 1 , k ) )
        if k > 0 :
            ans = max ( ans , solve ( i + 1 , j - 1 , k - 1 ) + 2 )
    dp [ i ] [ j ] [ k ] = ans
    return ans
