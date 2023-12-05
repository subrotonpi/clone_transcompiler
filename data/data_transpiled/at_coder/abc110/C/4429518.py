def main ( ) :
    import sys
    from string import printable
    sc = printable.Scanner ( )
    s = sc.next ( ).split ( ' ' )
    t = sc.next ( ).split ( ' ' )
    start = [ - 1 ] * 26
    goal = [ - 1 ] * 26
    is_ans = True
    for i in range ( 26 ) :
        start [ i ] = - 1
        goal [ i ] = - 1
    for a in s :
        b = t [ a ]
        if start [ a ] != - 1 or goal [ b ] != - 1 :
            if start [ a ] != b or goal [ b ] != a :
                is_ans = False
                break
        start [ a ] = b
        goal [ b ] = a
    print ( 'Yes' if is_ans else 'No' )
