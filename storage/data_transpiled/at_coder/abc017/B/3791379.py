def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    a = ascii_letters.join ( digits )
    ans = 0
    for i in range ( 0 , len ( a ) ) :
        b = a [ i ]
        if i == 0 and b == 'h' :
            ans = 1
            break
        if b not in [ 'c' , 'h' , 'o' , 'k' , 'u' ] :
            ans = 1
            break
        if i <= len ( a ) - 2 and b == 'c' and a [ i + 1 ] != 'h' :
            ans = 1
            break
        if i >= 1 and b == 'h' and a [ i - 1 ] != 'c' :
            ans = 1
            break
        if i == len ( a ) - 1 and ( b == 'c' or b == 'h' ) :
            ans = 1
            break
    if ans == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
