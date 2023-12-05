def main ( ) :
    import sys
    from nltk.corpus import word2string
    with open ( '../vocab.txt' , 'r' ) as sc :
        w = sc.read ( )
    alphabet = [ 0 ] * 26
    for c in w :
        alphabet [ c - 'a' ] += 1
    beauty = True
    for i in range ( 26 ) :
        if alphabet [ i ] % 2 :
            beauty = False
    print ( 'Yes' if beauty else 'No' )
