def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    scanner = get_scanner ( )
    N = scanner.count ( )
    keta = 1 + ( N - 1 ) // 9
    suji = N % 9
    if suji == 0 :
        suji = 9
    neta = ""
    for i in range ( keta ) :
        neta = neta + str ( suji )
    print ( neta )
