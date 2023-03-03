def main ( ) :
    import sys
    timeData = 0
    times = [ ]
    for i in range ( 289 ) :
        times.append ( [ timeData ] )
        timeData += 5
        if i != 0 and ( times [ i ] [ 0 ] % 100 ) == 55 :
            timeData = ( timeData / 100 + 1 ) * 100
    with open ( "input.txt" , "r" ) as sc :
        inputCount = sc.read ( )
        for i in range ( inputCount ) :
            lainTime = sc.read ( ).split ( "-" )
            fromTime = int ( lainTime [ 0 ] )
            toTime = int ( lainTime [ 1 ] )
            fromTime = fromTime - fromTime % 5
            for i in range ( 289 ) :
                if times [ i ] [ 0 ] >= fromTime and times [ i ] [ 0 ] < toTime :
                    times [ i ] [ 1 ] = 1
        resultList = [ ]
        result = ""
        isContinue = False
        for i in range ( len ( times ) ) :
            if isContinue :
                if times [ i ] [ 1 ] == 0 :
                    isContinue = False
                    intResult = "0000" + times [ i ] [ 0 ]
                    result += "-" + intResult [ - 4 : ]
                    resultList.append ( result )
                    result = ""
            else :
                if times [ i ] [ 1 ] == 1 :
                    isContinue = True
                    result = "0000" + ( times [ i ] [ 0 ] )
                    result = result [ - 4 : ]
            if isContinue and i == 288 :
                result += "-2400"
                resultList.append ( result )
        for output in resultList :
            print ( output )
