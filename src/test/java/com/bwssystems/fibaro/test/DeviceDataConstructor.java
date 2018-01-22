package com.bwssystems.fibaro.test;

import com.bwssystems.HABridge.plugins.fibaro.json.Device;
import com.google.gson.Gson;

public class DeviceDataConstructor {
	public final static String TestData = "[{\"id\":7,\"name\":\"Deckenspots\",\"roomID\":12,\"type\":\"com.fibaro.FGD212\",\"baseType\":\"com.fibaro.multilevelSwitch\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":5,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"deviceGrouping\",\"energy\",\"levelChange\",\"light\",\"power\",\"zwave\",\"zwaveAlarm\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,4,5\",\"zwaveVersion\":\"3.5\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"alarmLevel\":\"0\",\"alarmType\":\"0\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"23\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"15\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"1\",\"energy\":\"7.23\",\"isLight\":\"true\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"2\",\"parametersTemplate\":\"796\",\"power\":\"5.80\",\"productInfo\":\"1,15,1,2,16,0,3,5\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneActivation\":\"25\",\"serialNumber\":\"h'000000000001c1b4\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"5\"},\"actions\":{\"reconfigure\":0,\"reset\":0,\"sceneActivationSet\":0,\"setValue\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"stopLevelChange\":0,\"turnOff\":0,\"turnOn\":0},\"created\":1516643104,\"modified\":1516643104,\"sortOrder\":1},{\"id\":13,\"name\":\"Licht Küche\",\"roomID\":13,\"type\":\"com.fibaro.binarySwitch\",\"baseType\":\"com.fibaro.actor\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":10,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":fals" + 
			"e,\"interfaces\":[\"deviceGrouping\",\"energy\",\"light\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,4,5\",\"zwaveVersion\":\"3.2\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"2\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"2\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"1\",\"energy\":\"9.51\",\"isLight\":\"true\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"3\",\"parametersTemplate\":\"781\",\"power\":\"16.00\",\"productInfo\":\"1,15,2,3,16,0,3,2\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"serialNumber\":\"h'000000000000450d\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"true\"},\"actions\":{\"reconfigure\":0,\"reset\":0,\"turnOff\":0,\"turnOn\":0},\"created\":1516643104,\"modified\":1516643104,\"sortOrder\":2},{\"id\":14,\"name\":\"Lampe Tisch\",\"roomID\":14,\"type\":\"com.fibaro.binarySwitch\",\"baseType\":\"com.fibaro.actor\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":10,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"deviceGrouping\",\"energy\",\"light\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,4,5\",\"zwaveVersion\":\"3.2\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"2\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"2\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"2\",\"energy\":\"29.15\",\"isLight\":\"true\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":" + 
			"\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"3\",\"parametersTemplate\":\"781\",\"power\":\"11.50\",\"productInfo\":\"1,15,2,3,16,0,3,2\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"serialNumber\":\"h'000000000000450d\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"true\"},\"actions\":{\"reconfigure\":0,\"reset\":0,\"turnOff\":0,\"turnOn\":0},\"created\":1516643104,\"modified\":1516643104,\"sortOrder\":3},{\"id\":18,\"name\":\"Licht\",\"roomID\":16,\"type\":\"com.fibaro.binarySwitch\",\"baseType\":\"com.fibaro.actor\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":15,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"deviceGrouping\",\"energy\",\"light\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,4,5\",\"zwaveVersion\":\"3.2\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"2\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"2\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"1\",\"energy\":\"2.70\",\"isLight\":\"true\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"4\",\"parametersTemplate\":\"781\",\"power\":\"0.00\",\"productInfo\":\"1,15,2,3,16,0,3,2\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"serialNumber\":\"h'00000000000044b4\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTempl" + 
			"ate\":\"true\",\"userDescription\":\"\",\"value\":\"false\"},\"actions\":{\"reconfigure\":0,\"reset\":0,\"turnOff\":0,\"turnOn\":0},\"created\":1516643104,\"modified\":1516643104,\"sortOrder\":4},{\"id\":26,\"name\":\"Licht\",\"roomID\":5,\"type\":\"com.fibaro.FGD212\",\"baseType\":\"com.fibaro.multilevelSwitch\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":24,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"deviceGrouping\",\"energy\",\"levelChange\",\"light\",\"power\",\"zwave\",\"zwaveAlarm\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,4,5\",\"zwaveVersion\":\"3.5\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"alarmLevel\":\"0\",\"alarmType\":\"0\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"23\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"15\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"1\",\"energy\":\"28.02\",\"isLight\":\"true\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"7\",\"parametersTemplate\":\"796\",\"power\":\"0.00\",\"productInfo\":\"1,15,1,2,16,0,3,5\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneActivation\":\"0\",\"serialNumber\":\"h'0000000000001fec\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\"},\"actions\":{\"reconfigure\":0,\"reset\":0,\"sceneActivationSet\":0,\"setValue\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"stopLevelChange\":0,\"turnOff\":0,\"turnOn\":0},\"created\":1516643105,\"modified\":1516643105,\"sortOrder\":5},{\"id\":57,\"name\":\"Fenster rechts\",\"roomID\":14,\"type\":\"com.fibaro.FGRM222\",\"baseType\":\"com.fibaro.FGR\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":56,\"remoteGatewayId\"" + 
			":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"energy\",\"levelChange\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,3,52\",\"zwaveVersion\":\"25.25\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"54\",\"deviceIcon\":\"87\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"energy\":\"0.78\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"19\",\"parametersTemplate\":\"721\",\"power\":\"0.00\",\"productInfo\":\"1,15,3,2,16,0,25,25\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionLocal\":\"0\",\"protectionLocalSupport\":\"5\",\"protectionRF\":\"0\",\"protectionRFSupport\":\"3\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneActivation\":\"0\",\"serialNumber\":\"\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\",\"value2\":\"0\"},\"actions\":{\"close\":0,\"open\":0,\"reconfigure\":0,\"reset\":0,\"sceneActivationSet\":0,\"setValue\":1,\"setValue2\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"stop\":0,\"stopLevelChange\":0},\"created\":1516643105,\"modified\":1516643105,\"sortOrder\":12},{\"id\":60,\"name\":\"Fenster mitte\",\"roomID\":14,\"type\":\"com.fibaro.FGRM222\",\"baseType\":\"com.fibaro.FGR\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":59,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"energy\",\"levelChange\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,3,52\",\"zwaveVersion\":\"25.25\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlT" + 
			"ype\":\"54\",\"deviceIcon\":\"87\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"energy\":\"0.71\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"20\",\"parametersTemplate\":\"721\",\"power\":\"0.00\",\"productInfo\":\"1,15,3,2,16,0,25,25\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionLocal\":\"0\",\"protectionLocalSupport\":\"5\",\"protectionRF\":\"0\",\"protectionRFSupport\":\"3\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneActivation\":\"26\",\"serialNumber\":\"\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\",\"value2\":\"0\"},\"actions\":{\"close\":0,\"open\":0,\"reconfigure\":0,\"reset\":0,\"sceneActivationSet\":0,\"setValue\":1,\"setValue2\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"stop\":0,\"stopLevelChange\":0},\"created\":1516643105,\"modified\":1516643105,\"sortOrder\":13},{\"id\":74,\"name\":\"Fenster links\",\"roomID\":14,\"type\":\"com.fibaro.FGRM222\",\"baseType\":\"com.fibaro.FGR\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":73,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"energy\",\"levelChange\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,3,52\",\"zwaveVersion\":\"25.25\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"54\",\"deviceIcon\":\"87\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"energy\":\"0.64\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"21\",\"parametersTemplate\":\"721\",\"power\":\"0.00\",\"productInfo\":\"1,15,3,2,16,0" + 
			",25,25\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionLocal\":\"0\",\"protectionLocalSupport\":\"5\",\"protectionRF\":\"0\",\"protectionRFSupport\":\"3\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneActivation\":\"0\",\"serialNumber\":\"\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\",\"value2\":\"0\"},\"actions\":{\"close\":0,\"open\":0,\"reconfigure\":0,\"reset\":0,\"sceneActivationSet\":0,\"setValue\":1,\"setValue2\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"stop\":0,\"stopLevelChange\":0},\"created\":1516643106,\"modified\":1516643106,\"sortOrder\":14},{\"id\":77,\"name\":\"Fenster Sideboard\",\"roomID\":14,\"type\":\"com.fibaro.FGRM222\",\"baseType\":\"com.fibaro.FGR\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":76,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"energy\",\"levelChange\",\"power\",\"zwave\",\"zwaveMultiChannelAssociation\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,3,52\",\"zwaveVersion\":\"25.25\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"54\",\"deviceIcon\":\"87\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"energy\":\"0.63\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"22\",\"parametersTemplate\":\"721\",\"power\":\"0.00\",\"productInfo\":\"1,15,3,2,16,0,25,25\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionLocal\":\"0\",\"protectionLocalSupport\":\"5\",\"protectionRF\":\"0\",\"protectionRFSupport\":\"3\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneAc" + 
			"tivation\":\"0\",\"serialNumber\":\"\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\",\"value2\":\"0\"},\"actions\":{\"close\":0,\"open\":0,\"reconfigure\":0,\"reset\":0,\"sceneActivationSet\":0,\"setValue\":1,\"setValue2\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"stop\":0,\"stopLevelChange\":0},\"created\":1516643106,\"modified\":1516643106,\"sortOrder\":15},{\"id\":112,\"name\":\"Stehlampe\",\"roomID\":12,\"type\":\"com.fibaro.multilevelSwitch\",\"baseType\":\"com.fibaro.binarySwitch\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":111,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"deviceGrouping\",\"fibaroFirmwareUpdate\",\"levelChange\",\"light\",\"zwave\",\"zwaveSwitchAll\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Domitech Products\",\"zwaveInfo\":\"3,4,5\",\"zwaveVersion\":\"5.14\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"23\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"15\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"firmwareUpdate\":\"{\\\"info\\\":\\\"\\\",\\\"progress\\\":0,\\\"status\\\":\\\"UpToDate\\\",\\\"updateVersion\\\":\\\"5.14\\\"}\",\"isLight\":\"true\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"27\",\"parametersTemplate\":\"807\",\"productInfo\":\"2,14,76,66,49,52,5,14\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"serialNumber\":\"\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"switchAllMode\":\"SWITCH_ALL_INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY\",\"updateVersion\":\"\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\"},\"actions\":{\"abortUpdate\":1,\"reconfigure\":0,\"retryUpdate\":1,\"setValue\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"startUpdate\":1,\"stopLevelChange\":0,\"turnOff\":0,\"turnOn\":0,\"updateFirmware\":1},\"created\":1516643107,\"modified\":1516643107,\"sortOrder\":6},{\"id\":114,\"name\":\"RGBW\",\"roomID\":12,\"type\":\"com.fibaro.FGRGBW441M\",\"baseType\":\"com.fibaro.colorController\",\"enabled\":true,\"visible\":tr" + 
			"ue,\"isPlugin\":false,\"parentId\":113,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"deviceGrouping\",\"energy\",\"fibaroFirmwareUpdate\",\"levelChange\",\"light\",\"power\",\"zwave\",\"zwaveSwitchAll\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,3,52\",\"zwaveVersion\":\"26.25\",\"associationMode\":\"0\",\"brightness\":\"0\",\"buttonType\":\"0\",\"color\":\"0,0,0,0\",\"configured\":true,\"currentProgram\":\"0\",\"currentProgramID\":\"0\",\"dead\":\"false\",\"deviceControlType\":\"50\",\"deviceGroup\":\"[]\",\"deviceGroupMaster\":\"0\",\"deviceIcon\":\"15\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"energy\":\"1.72\",\"favoriteProgram\":\"0\",\"firmwareUpdate\":\"{\\\"info\\\":\\\"\\\",\\\"progress\\\":0,\\\"status\\\":\\\"UpToDate\\\",\\\"updateVersion\\\":\\\"26.25\\\"}\",\"isLight\":\"true\",\"lastColorSet\":\"0,0,0,0\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"mode\":\"0\",\"model\":\"\",\"nodeId\":\"28\",\"parametersTemplate\":\"231\",\"power\":\"0.00\",\"productInfo\":\"1,15,9,0,16,0,26,25\",\"programsSortOrder\":\"1,2,3,4,5\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"rememberColor\":\"false\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"serialNumber\":\"\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"switchAllMode\":\"SWITCH_ALL_INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY\",\"updateVersion\":\"\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\"},\"actions\":{\"abortUpdate\":1,\"reconfigure\":0,\"reset\":0,\"retryUpdate\":1,\"setB\":1,\"setBrightness\":1,\"setColor\":1,\"setFavoriteProgram\":2,\"setG\":1,\"setR\":1,\"setValue\":1,\"setW\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"startProgram\":1,\"startUpdate\":1,\"stopLevelChange\":0,\"turnOff\":0,\"turnOn\":0,\"updateFirmware\":1},\"created\":1516643107,\"modified\":1516643107,\"sortOrder\":7},{\"id\":122,\"name\":\"Fenster\",\"roomID\":12,\"type\":\"com.fibaro.FGRM222\",\"baseType\":\"com.fibaro.FGR\",\"enabled\":true,\"visible\":true,\"isPlugin\":false,\"parentId\":121,\"remoteGatewayId\":0,\"viewXml\":false,\"configXml\":false,\"interfaces\":[\"energy\",\"fibaroFirmwareUpdate\",\"levelChange\",\"powe" + 
			"r\",\"zwave\",\"zwaveConfiguration\",\"zwaveProtection\",\"zwaveSceneActivation\"],\"properties\":{\"pollingTimeSec\":0,\"zwaveCompany\":\"Fibargroup\",\"zwaveInfo\":\"3,3,52\",\"zwaveVersion\":\"24.24\",\"RFProtectionState\":\"0\",\"RFProtectionSupport\":\"3\",\"configured\":true,\"dead\":\"false\",\"deviceControlType\":\"54\",\"deviceIcon\":\"87\",\"emailNotificationID\":\"0\",\"emailNotificationType\":\"0\",\"endPointId\":\"0\",\"energy\":\"0.17\",\"firmwareUpdate\":\"{\\\"info\\\":\\\"\\\",\\\"progress\\\":0,\\\"status\\\":\\\"UpToDate\\\",\\\"updateVersion\\\":\\\"24.24\\\"}\",\"liliOffCommand\":\"\",\"liliOnCommand\":\"\",\"localProtectionState\":\"0\",\"localProtectionSupport\":\"5\",\"log\":\"\",\"logTemp\":\"\",\"manufacturer\":\"\",\"markAsDead\":\"true\",\"model\":\"\",\"nodeId\":\"29\",\"parametersTemplate\":\"249\",\"power\":\"0.00\",\"productInfo\":\"1,15,3,1,16,1,24,24\",\"protectionExclusiveControl\":\"0\",\"protectionExclusiveControlSupport\":\"false\",\"protectionState\":\"0\",\"protectionTimeout\":\"0\",\"protectionTimeoutSupport\":\"false\",\"pushNotificationID\":\"0\",\"pushNotificationType\":\"0\",\"remoteGatewayId\":\"0\",\"saveLogs\":\"true\",\"sceneActivation\":\"0\",\"serialNumber\":\"\",\"showEnergy\":\"true\",\"smsNotificationID\":\"0\",\"smsNotificationType\":\"0\",\"updateVersion\":\"\",\"useTemplate\":\"true\",\"userDescription\":\"\",\"value\":\"0\",\"value2\":\"0\"},\"actions\":{\"abortUpdate\":1,\"close\":0,\"getParameter\":1,\"open\":0,\"reconfigure\":0,\"reset\":0,\"retryUpdate\":1,\"sceneActivationSet\":0,\"setParameter\":2,\"setValue\":1,\"setValue2\":1,\"startLevelDecrease\":0,\"startLevelIncrease\":0,\"startUpdate\":1,\"stop\":0,\"stopLevelChange\":0,\"updateFirmware\":1},\"created\":1516643108,\"modified\":1516643108,\"sortOrder\":16}]";
	public static void main(String[] args){
		DeviceDataConstructor aTestService = new DeviceDataConstructor();
		if(aTestService.validateStructure())
			System.out.println("Test Successful");
	}

	public Boolean validateStructure() {
		String theData = TestData;
		try {
			Device[] decodeTarget = new Gson().fromJson(theData, Device[].class);
			for(int i = 0; i < decodeTarget.length; i++) {
				System.out.println(decodeTarget[i].getName() + " " + decodeTarget[i].getId() + " " + decodeTarget[i].getRoomName());
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}