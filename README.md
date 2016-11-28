# react-native-realpath

## 使用方法
npm i git+https://github.com/IllegalCreed/react-native-realpath.git --save

## 应用场景

当你使用类似imagePicker之类的组件的时候你可能会得到一个uri的路径
这个路径可能形如content://或者file://
这种形式的路径在某些需要实际路径的android原生控件中无法识别，这个时候就需要用到这个库了

## 用法

```
import React from 'react';
import {
  NativeModules
} from 'react-native';
const RealPath = NativeModules.RealPath;

RealPath.getRealPath("你的uri").then((path)=>{
          ...
        });
```

