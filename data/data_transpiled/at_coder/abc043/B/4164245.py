def main ( ) :
    import sys
    from string import printable
    from string import printable
    from string import letters
    from string import digits
    from string import letters
    from string import digits
    from string import punctuation
    a = printable.join ( letters )
    count = 0
    ans = [ ]
    ans.append ( - 1 )
    for b in a :
        if b == '0' :
            ans.append ( 0 )
            count += 1
        if b == '1' :
            ans.append ( 1 )
            count += 1
        if b == 'B' :
            count -= 1
            if count < 0 :
                count = 0
            ans.append ( - 1 )
        if count < 0 :
            count = 0
    for i in range ( 0 , len ( ans ) ) :
        if ans [ i ] == - 1 :
            break
        print ( ans [ i ] , end = ' ' )
    print ( )
