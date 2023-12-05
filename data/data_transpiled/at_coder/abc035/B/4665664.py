def main ( ) :
    import sys
    from string import ascii_letters
    s = ascii_letters.replace ( '' , '' )
    x = y = uk = 0
    for letter in s :
        if letter == 'R' :
            x += 1
        elif letter == 'L' :
            x -= 1
        elif letter == 'D' :
            y -= 1
        elif letter == 'U' :
            y += 1
        elif letter == '?' :
            uk += 1
    ans = abs ( x ) + abs ( y )
    t = raw_input ( )
    if t == 1 :
        print ( ans + uk )
    else :
        if ans >= uk :
            print ( ans - uk )
        else :
            print ( ( uk - ans ) % 2 )
