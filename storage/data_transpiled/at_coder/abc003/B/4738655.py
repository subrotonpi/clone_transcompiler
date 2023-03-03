def main ( ) :
    import sys
    from string import ascii_letters
    import string
    s = ascii_letters.replace ( 'a' , 't' )
    t = ascii_letters.replace ( 'c' , 'o' )
    s = s.replace ( 'd' , 'e' )
    t = t.replace ( 'r' , 'e' )
    to_replace = [ 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ]
    can_win = True
    for i in range ( len ( s ) ) :
        if not can_win :
            break
        if s [ i ] == t [ i ] :
            can_win = True
        elif s [ i ] == '@' :
            can_win = contain_to_replace ( t [ i ] )
        elif t [ i ] == '@' :
            can_win = contain_to_replace ( s [ i ] )
        else :
            can_win = False
    msg = ''
    if can_win :
        msg = 'You can win'
    else :
        msg = 'You will lose'
    print ( msg )
