def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 's1' )
    S = sc.read ( )
    cnta = cntb = cntc = 0
    for i in range ( 3 ) :
        if S [ i ] == 'a' :
            cnta += 1
        elif S [ i ] == 'b' :
            cntb += 1
        elif S [ i ] == 'c' :
            cntc += 1
    if cnta == 1 and cntb == 1 and cntc == 1 :
        print ( 'Yes' )
    else :
        print ( 'No' )
