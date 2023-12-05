def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    s = sc.next ( )
    s1 = [ s [ i ] for i in range ( len ( s ) ) ]
    ans = 0
    for i in range ( pow ( 2 , len ( s ) - 1 ) ) :
        t = i
        count = 1
        a = str ( s1 [ 0 ] )
        while count < len ( s ) :
            if t & 1 == 1 :
                ans += int ( a )
                a = str ( s1 [ count ] )
            else :
                a += s1 [ count ]
            t >>= 1
            count += 1
        ans += int ( a )
    print ( ans )
