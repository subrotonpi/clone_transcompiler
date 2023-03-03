def main ( ) :
    import sys
    from string import printable
    reader = open ( 'input.txt' , 'r' )
    N = reader.read ( )
    ans = 0
    for ch in N :
        if ch == '+' :
            ans += 1
        else :
            ans -= 1
    print ( ans )
    reader.close ( )
