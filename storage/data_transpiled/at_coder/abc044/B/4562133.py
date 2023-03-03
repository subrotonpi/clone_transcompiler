def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    c = 'a'
    cnt = [ 0 ] * 26
    for i in s :
        cnt [ i - c ] += 1
    ans = True
    for i in range ( 26 ) :
        if cnt [ i ] != 0 and cnt [ i ] % 2 == 1 :
            ans = False
    print ( 'Yes' if ans else 'No' )
