def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = Scanner ( )
    s = sc.next ( )
    t = sc.next ( )
    for i in range ( len ( s ) - len ( t ) , - 1 , - 1 ) :
        count = 0
        for j in range ( i , i + len ( t ) ) :
            if s [ j ] == t [ j - i ] or s [ j ] == '?' :
                count += 1
                continue
            else :
                break
        if count == len ( t ) :
            ans = s [ : i ] + t + s [ i + len ( t ) : ]
            ans = ans.replace ( '?' , 'a' )
            print ( ans )
            return
    print ( 'UNRESTORABLE' )
