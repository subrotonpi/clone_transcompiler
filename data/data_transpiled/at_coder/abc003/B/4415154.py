def main ( args ) :
    import re
    sc = Scanner ( )
    win = True
    s = sc.next ( )
    t = sc.next ( )
    for i in s :
        if i == t [ i ] :
            continue
        elif i == "@" and re.match ( "[atcoder]" , str ( t [ i ] ) ) :
            continue
        elif i == "@" and re.match ( "[atcoder]" , str ( s [ i ] ) ) :
            continue
        win = False
    print ( "You can win" if win else "You will lose" )
