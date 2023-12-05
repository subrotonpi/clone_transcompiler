def main ( args ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    ans = 0
    s = sc.next ( )
    for i in s :
        if '+' == i :
            ans += 1
        else :
            ans -= 1
    print ( ans )
