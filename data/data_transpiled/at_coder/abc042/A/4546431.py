def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    scanner = get_scanner ( )
    a = scanner.next ( )
    b = scanner.next ( )
    c = scanner.next ( )
    cnt_5 = 0
    cnt_7 = 0
    if a == 5 :
        cnt_5 += 1
    elif a == 7 :
        cnt_7 += 1
    if b == 5 :
        cnt_5 += 1
    elif b == 7 :
        cnt_7 += 1
    if c == 5 :
        cnt_5 += 1
    elif c == 7 :
        cnt_7 += 1
    if cnt_5 == 2 and cnt_7 == 1 :
        print ( 'YES' )
    else :
        print ( 'NO' )
