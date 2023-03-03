def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = Scanner ( )
    x = sc.next ( )
    input = sc.next ( ).split ( '' )
    ans = ''
    for i in input :
        if not i in ans :
            ans += i
    print ( ans )
