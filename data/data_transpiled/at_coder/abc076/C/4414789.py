def main ( ) :
    import re
    from sys import stdin
    from string import ascii_lowercase
    from string import ascii_lowercase
    from string import ascii_uppercase
    from string import ascii_lowercase
    from string import ascii_uppercase
    from string import ascii_lowercase
    from string import ascii_uppercase
    from string import ascii_lowercase
    S = ascii_lowercase
    T = ascii_uppercase
    S = S.replace ( '?' , '' )
    T = ascii_lowercase.replace ( '?' , '' )
    S = S.replace ( '?' , '' )
    len_T = len ( T )
    for i in range ( len ( S ) , len_T - 1 , - 1 ) :
        cnt = 0
        for j in range ( len_T , 0 , - 1 ) :
            K = i - cnt
            if S [ K - 1 : K ] == T [ j - 1 : j ] or S [ K - 1 : K ] == '?' :
                cnt += 1
                continue
            else :
                cnt = 0
                break
        if cnt >= len_T :
            S [ i - len_T : i ] = T
            S = ''.join ( S )
            S = re.sub ( re.escape ( '?' ) , 'a' , S )
            print ( S )
            sys.exit ( 0 )
    print ( 'UNRESTORABLE' )
