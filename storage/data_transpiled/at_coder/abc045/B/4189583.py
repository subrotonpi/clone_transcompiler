def main ( ) :
    import sys
    from string import ascii_letters
    s = [ ascii_letters , ascii_letters , ascii_letters ]
    turn = 'a'
    while 1 :
        if not s [ turn - 'a' ] :
            break
        c = s [ turn - 'a' ] [ 0 ]
        s [ turn - 'a' ] = s [ turn - 'a' ] [ 1 : ]
        turn = c
    print ( 'A' if turn == 'a' else 'B' if turn == 'b' else 'C' )
