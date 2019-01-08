/**
 * Axis2UserGuideServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.apache.axis2.axis2userguide;


/*
 *  Axis2UserGuideServiceStub java implementation
 */
public class Axis2UserGuideServiceStub extends org.apache.axis2.client.Stub {

	private static int counter = 0;
	protected org.apache.axis2.description.AxisOperation[] _operations;

	//hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();
	private javax.xml.namespace.QName[] opNameArray = null;

	/**
	 * Constructor that takes in a configContext
	 */
	public Axis2UserGuideServiceStub(
		org.apache.axis2.context.ConfigurationContext configurationContext,
		java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public Axis2UserGuideServiceStub(
		org.apache.axis2.context.ConfigurationContext configurationContext,
		java.lang.String targetEndpoint, boolean useSeparateListener)
		throws org.apache.axis2.AxisFault {
		//To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
			_service);

		_serviceClient.getOptions()
			.setTo(new org.apache.axis2.addressing.EndpointReference(
				targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
	}

	/**
	 * Default Constructor
	 */
	public Axis2UserGuideServiceStub(
		org.apache.axis2.context.ConfigurationContext configurationContext)
		throws org.apache.axis2.AxisFault {
		this(configurationContext,
			"http://localhost:8080/axis2/services/Axis2UserGuide");
	}

	/**
	 * Default Constructor
	 */
	public Axis2UserGuideServiceStub() throws org.apache.axis2.AxisFault {
		this("http://localhost:8080/axis2/services/Axis2UserGuide");
	}

	/**
	 * Constructor taking the target endpoint
	 */
	public Axis2UserGuideServiceStub(java.lang.String targetEndpoint)
		throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}

		counter = counter + 1;

		return java.lang.Long.toString(java.lang.System.currentTimeMillis())
			+ "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {
		//creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService(
			"Axis2UserGuideService" + getUniqueSuffix());
		addAnonymousOperations();

		//creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[4];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
			"http://apache.org/axis2/Axis2UserGuide", "noParameters"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
			"http://apache.org/axis2/Axis2UserGuide",
			"twoWayOneParameterEcho"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
			"http://apache.org/axis2/Axis2UserGuide",
			"multipleParametersAddItem"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutOnlyAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
			"http://apache.org/axis2/Axis2UserGuide", "doInOnly"));
		_service.addOperation(__operation);

		_operations[3] = __operation;
	}

	//populates the faults
	private void populateFaults() {
	}

	/**
	 * Auto generated method signature
	 *
	 * @see org.apache.axis2.axis2userguide.Axis2UserGuideService#noParameters
	 * @param noParametersRequest
	 */
	public org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse noParameters(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest noParametersRequest)
		throws java.rmi.RemoteException {
		org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("NoParameters");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()),
				noParametersRequest,
				optimizeContent(
					new javax.xml.namespace.QName(
						"http://apache.org/axis2/Axis2UserGuide",
						"noParameters")),
				new javax.xml.namespace.QName(
					"http://apache.org/axis2/Axis2UserGuide",
					"NoParametersRequest"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
				.getFirstElement(),
				org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse.class);

			return (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse) object;
		} catch (org.apache.axis2.AxisFault f) {
			org.apache.axiom.om.OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
					new org.apache.axis2.client.FaultMapKey(
						faultElt.getQName(), "NoParameters"))) {
					//make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
							faultElt.getQName(), "NoParameters"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

						//message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
							faultElt.getQName(), "NoParameters"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
							messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
							new java.lang.Class[]{messageClass});
						m.invoke(ex, new java.lang.Object[]{messageObject});

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see
	 * org.apache.axis2.axis2userguide.Axis2UserGuideService#twoWayOneParameterEcho
	 * @param twoWayOneParameterEchoRequest
	 */
	public org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse twoWayOneParameterEcho(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest twoWayOneParameterEchoRequest)
		throws java.rmi.RemoteException {
		org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("TwoWayOneParameterEcho");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()),
				twoWayOneParameterEchoRequest,
				optimizeContent(
					new javax.xml.namespace.QName(
						"http://apache.org/axis2/Axis2UserGuide",
						"twoWayOneParameterEcho")),
				new javax.xml.namespace.QName(
					"http://apache.org/axis2/Axis2UserGuide",
					"TwoWayOneParameterEchoRequest"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
				.getFirstElement(),
				org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse.class);

			return (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse) object;
		} catch (org.apache.axis2.AxisFault f) {
			org.apache.axiom.om.OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
					new org.apache.axis2.client.FaultMapKey(
						faultElt.getQName(), "TwoWayOneParameterEcho"))) {
					//make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
							faultElt.getQName(),
							"TwoWayOneParameterEcho"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

						//message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
							faultElt.getQName(),
							"TwoWayOneParameterEcho"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
							messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
							new java.lang.Class[]{messageClass});
						m.invoke(ex, new java.lang.Object[]{messageObject});

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see
	 * org.apache.axis2.axis2userguide.Axis2UserGuideService#multipleParametersAddItem
	 * @param multipleParametersAddItemRequest
	 */
	public org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse multipleParametersAddItem(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest multipleParametersAddItemRequest)
		throws java.rmi.RemoteException {
		org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("MultipleParametersAddItem");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()),
				multipleParametersAddItemRequest,
				optimizeContent(
					new javax.xml.namespace.QName(
						"http://apache.org/axis2/Axis2UserGuide",
						"multipleParametersAddItem")),
				new javax.xml.namespace.QName(
					"http://apache.org/axis2/Axis2UserGuide",
					"MultipleParametersAddItemRequest"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
				.getFirstElement(),
				org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse.class);

			return (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse) object;
		} catch (org.apache.axis2.AxisFault f) {
			org.apache.axiom.om.OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
					new org.apache.axis2.client.FaultMapKey(
						faultElt.getQName(), "MultipleParametersAddItem"))) {
					//make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
							faultElt.getQName(),
							"MultipleParametersAddItem"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

						//message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
							faultElt.getQName(),
							"MultipleParametersAddItem"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
							messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
							new java.lang.Class[]{messageClass});
						m.invoke(ex, new java.lang.Object[]{messageObject});

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 */
	public void doInOnly(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest doInOnlyRequest)
		throws java.rmi.RemoteException {
		org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("DoInOnly");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
			org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
			"&");

		org.apache.axiom.soap.SOAPEnvelope env = null;

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
			.getSoapVersionURI()),
			doInOnlyRequest,
			optimizeContent(
				new javax.xml.namespace.QName(
					"http://apache.org/axis2/Axis2UserGuide", "doInOnly")),
			new javax.xml.namespace.QName(
				"http://apache.org/axis2/Axis2UserGuide", "DoInOnlyRequest"));

		//adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message contxt to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.execute(true);

		if (_messageContext.getTransportOut() != null) {
			_messageContext.getTransportOut().getSender()
				.cleanup(_messageContext);
		}

		return;
	}

	private boolean optimizeContent(javax.xml.namespace.QName opName) {
		if (opNameArray == null) {
			return false;
		}

		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}

		return false;
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest param,
		boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory,
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest param,
		boolean optimizeContent, javax.xml.namespace.QName elementQName)
		throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
				.addChild(param.getOMElement(
					org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest.MY_QNAME,
					factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory,
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest param,
		boolean optimizeContent, javax.xml.namespace.QName elementQName)
		throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
				.addChild(param.getOMElement(
					org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest.MY_QNAME,
					factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory,
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest param,
		boolean optimizeContent, javax.xml.namespace.QName elementQName)
		throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
				.addChild(param.getOMElement(
					org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest.MY_QNAME,
					factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory,
		org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest param,
		boolean optimizeContent, javax.xml.namespace.QName elementQName)
		throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
				.addChild(param.getOMElement(
					org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest.MY_QNAME,
					factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
		java.lang.Class type) throws org.apache.axis2.AxisFault {
		try {
			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.DoInOnlyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.MultipleParametersAddItemResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.NoParametersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse.class.equals(
				type)) {
				return org.apache.axis2.axis2userguide.Axis2UserGuideServiceStub.TwoWayOneParameterEchoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

		return null;
	}

	//http://localhost:8080/axis2/services/Axis2UserGuide
	public static class MultipleParametersAddItemResponse implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"MultipleParametersAddItemResponse", "ns1");

		/**
		 * field for ItemId
		 */
		protected int localItemId;

		/**
		 * field for SuccessfulAdd
		 */
		protected boolean localSuccessfulAdd;

		/**
		 * Auto generated getter method
		 *
		 * @return int
		 */
		public int getItemId() {
			return localItemId;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param ItemId
		 */
		public void setItemId(int param) {
			this.localItemId = param;
		}

		/**
		 * Auto generated getter method
		 *
		 * @return boolean
		 */
		public boolean getSuccessfulAdd() {
			return localSuccessfulAdd;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param SuccessfulAdd
		 */
		public void setSuccessfulAdd(boolean param) {
			this.localSuccessfulAdd = param;
		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":MultipleParametersAddItemResponse",
						xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MultipleParametersAddItemResponse", xmlWriter);
				}
			}

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "itemId", xmlWriter);

			if (localItemId == java.lang.Integer.MIN_VALUE) {
				throw new org.apache.axis2.databinding.ADBException(
					"itemId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					localItemId));
			}

			xmlWriter.writeEndElement();

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "successfulAdd", xmlWriter);

			if (false) {
				throw new org.apache.axis2.databinding.ADBException(
					"successfulAdd cannot be null!!");
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					localSuccessfulAdd));
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static MultipleParametersAddItemResponse parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				MultipleParametersAddItemResponse object = new MultipleParametersAddItemResponse();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"MultipleParametersAddItemResponse".equals(
								type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (MultipleParametersAddItemResponse) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"itemId").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "itemId"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setItemId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"successfulAdd").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "successfulAdd"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setSuccessfulAdd(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// 2 - A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}

	public static class DoInOnlyRequest implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"DoInOnlyRequest", "ns1");

		/**
		 * field for MessageString
		 */
		protected java.lang.String localMessageString;

		/**
		 * Auto generated getter method
		 *
		 * @return java.lang.String
		 */
		public java.lang.String getMessageString() {
			return localMessageString;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param MessageString
		 */
		public void setMessageString(java.lang.String param) {
			this.localMessageString = param;
		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":DoInOnlyRequest", xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"DoInOnlyRequest", xmlWriter);
				}
			}

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "messageString", xmlWriter);

			if (localMessageString == null) {
				// write the nil attribute
				throw new org.apache.axis2.databinding.ADBException(
					"messageString cannot be null!!");
			} else {
				xmlWriter.writeCharacters(localMessageString);
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static DoInOnlyRequest parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				DoInOnlyRequest object = new DoInOnlyRequest();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"DoInOnlyRequest".equals(type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (DoInOnlyRequest) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"messageString").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "messageString"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setMessageString(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// 2 - A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}

	public static class TwoWayOneParameterEchoResponse implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"TwoWayOneParameterEchoResponse", "ns1");

		/**
		 * field for EchoString
		 */
		protected java.lang.String localEchoString;

		/**
		 * Auto generated getter method
		 *
		 * @return java.lang.String
		 */
		public java.lang.String getEchoString() {
			return localEchoString;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param EchoString
		 */
		public void setEchoString(java.lang.String param) {
			this.localEchoString = param;
		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":TwoWayOneParameterEchoResponse",
						xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"TwoWayOneParameterEchoResponse", xmlWriter);
				}
			}

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "echoString", xmlWriter);

			if (localEchoString == null) {
				// write the nil attribute
				throw new org.apache.axis2.databinding.ADBException(
					"echoString cannot be null!!");
			} else {
				xmlWriter.writeCharacters(localEchoString);
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static TwoWayOneParameterEchoResponse parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				TwoWayOneParameterEchoResponse object = new TwoWayOneParameterEchoResponse();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"TwoWayOneParameterEchoResponse".equals(type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (TwoWayOneParameterEchoResponse) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"echoString").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "echoString"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setEchoString(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// 2 - A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}

	public static class TwoWayOneParameterEchoRequest implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"TwoWayOneParameterEchoRequest", "ns1");

		/**
		 * field for EchoString
		 */
		protected java.lang.String localEchoString;

		/**
		 * Auto generated getter method
		 *
		 * @return java.lang.String
		 */
		public java.lang.String getEchoString() {
			return localEchoString;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param EchoString
		 */
		public void setEchoString(java.lang.String param) {
			this.localEchoString = param;
		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":TwoWayOneParameterEchoRequest",
						xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"TwoWayOneParameterEchoRequest", xmlWriter);
				}
			}

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "echoString", xmlWriter);

			if (localEchoString == null) {
				// write the nil attribute
				throw new org.apache.axis2.databinding.ADBException(
					"echoString cannot be null!!");
			} else {
				xmlWriter.writeCharacters(localEchoString);
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static TwoWayOneParameterEchoRequest parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				TwoWayOneParameterEchoRequest object = new TwoWayOneParameterEchoRequest();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"TwoWayOneParameterEchoRequest".equals(type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (TwoWayOneParameterEchoRequest) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"echoString").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "echoString"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setEchoString(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// 2 - A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}

	public static class MultipleParametersAddItemRequest implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"MultipleParametersAddItemRequest", "ns1");

		/**
		 * field for ItemId
		 */
		protected int localItemId;

		/**
		 * field for ItemName
		 */
		protected java.lang.String localItemName;

		/**
		 * field for Price
		 */
		protected float localPrice;

		/**
		 * field for Description
		 */
		protected java.lang.String localDescription;

		/**
		 * Auto generated getter method
		 *
		 * @return int
		 */
		public int getItemId() {
			return localItemId;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param ItemId
		 */
		public void setItemId(int param) {
			this.localItemId = param;
		}

		/**
		 * Auto generated getter method
		 *
		 * @return java.lang.String
		 */
		public java.lang.String getItemName() {
			return localItemName;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param ItemName
		 */
		public void setItemName(java.lang.String param) {
			this.localItemName = param;
		}

		/**
		 * Auto generated getter method
		 *
		 * @return float
		 */
		public float getPrice() {
			return localPrice;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param Price
		 */
		public void setPrice(float param) {
			this.localPrice = param;
		}

		/**
		 * Auto generated getter method
		 *
		 * @return java.lang.String
		 */
		public java.lang.String getDescription() {
			return localDescription;
		}

		/**
		 * Auto generated setter method
		 *
		 * @param param Description
		 */
		public void setDescription(java.lang.String param) {
			this.localDescription = param;
		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":MultipleParametersAddItemRequest",
						xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MultipleParametersAddItemRequest", xmlWriter);
				}
			}

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "itemId", xmlWriter);

			if (localItemId == java.lang.Integer.MIN_VALUE) {
				throw new org.apache.axis2.databinding.ADBException(
					"itemId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					localItemId));
			}

			xmlWriter.writeEndElement();

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "itemName", xmlWriter);

			if (localItemName == null) {
				// write the nil attribute
				throw new org.apache.axis2.databinding.ADBException(
					"itemName cannot be null!!");
			} else {
				xmlWriter.writeCharacters(localItemName);
			}

			xmlWriter.writeEndElement();

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "price", xmlWriter);

			if (java.lang.Float.isNaN(localPrice)) {
				throw new org.apache.axis2.databinding.ADBException(
					"price cannot be null!!");
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					localPrice));
			}

			xmlWriter.writeEndElement();

			namespace = "http://apache.org/axis2/Axis2UserGuide";
			writeStartElement(null, namespace, "description", xmlWriter);

			if (localDescription == null) {
				// write the nil attribute
				throw new org.apache.axis2.databinding.ADBException(
					"description cannot be null!!");
			} else {
				xmlWriter.writeCharacters(localDescription);
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static MultipleParametersAddItemRequest parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				MultipleParametersAddItemRequest object = new MultipleParametersAddItemRequest();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"MultipleParametersAddItemRequest".equals(type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (MultipleParametersAddItemRequest) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"itemId").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "itemId"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setItemId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"itemName").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "itemName"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setItemName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"price").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "price" + "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setPrice(org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
							"http://apache.org/axis2/Axis2UserGuide",
							"description").equals(reader.getName())) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

						if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "description"
								+ "  cannot be null");
						}

						java.lang.String content = reader.getElementText();

						object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							content));

						reader.next();
					} // End of if for expected property start element
					else {
						// 1 - A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}

					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					if (reader.isStartElement()) {
						// 2 - A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
					}
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}

	public static class ExtensionMapper {

		public static java.lang.Object getTypeObject(
			java.lang.String namespaceURI, java.lang.String typeName,
			javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			throw new org.apache.axis2.databinding.ADBException(
				"Unsupported type " + namespaceURI + " " + typeName);
		}
	}

	public static class NoParametersRequest implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"NoParametersRequest", "ns1");

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":NoParametersRequest", xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"NoParametersRequest", xmlWriter);
				}
			}

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static NoParametersRequest parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				NoParametersRequest object = new NoParametersRequest();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"NoParametersRequest".equals(type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (NoParametersRequest) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}

	public static class NoParametersResponse implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://apache.org/axis2/Axis2UserGuide",
			"NoParametersResponse", "ns1");

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {
			return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME));
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://apache.org/axis2/Axis2UserGuide");

				if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":NoParametersResponse", xmlWriter);
				} else {
					writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"NoParametersResponse", xmlWriter);
				}
			}

			xmlWriter.writeEndElement();
		}

		private static java.lang.String generatePrefix(
			java.lang.String namespace) {
			if (namespace.equals("http://apache.org/axis2/Axis2UserGuide")) {
				return "ns1";
			}

			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

			if (writerPrefix != null) {
				xmlWriter.writeAttribute(writerPrefix, namespace, attName,
					attValue);
			} else {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
				xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}

			java.lang.String attributeValue;

			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */
		private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();

			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix + ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
						qname));
				}
			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
					qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}

					namespaceURI = qnames[i].getNamespaceURI();

					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);

						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
									qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
								qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
							qnames[i]));
					}
				}

				xmlWriter.writeCharacters(stringToWrite.toString());
			}
		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);

					if ((uri == null) || (uri.length() == 0)) {
						break;
					}

					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

			/**
			 * static method to create the object Precondition: If this object is
			 * an element, the current or next start element starts this object and
			 * any intervening reader events are ignorable If this object is not an
			 * element, it is a complex type and the reader is at the event just
			 * after the outer start element Postcondition: If this object is an
			 * element, the reader is positioned at its end element If this object
			 * is a complex type, the reader is positioned at the end element of
			 * its outer element
			 */
			public static NoParametersResponse parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
				NoParametersResponse object = new NoParametersResponse();

				int event;
				javax.xml.namespace.QName currentQName = null;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";

				try {
					while (!reader.isStartElement() && !reader.isEndElement()) {
						reader.next();
					}

					currentQName = reader.getName();

					if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance",
						"type") != null) {
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;

							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
							}

							nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

							if (!"NoParametersResponse".equals(type)) {
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

								return (NoParametersResponse) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
							}
						}
					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();
				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}
		} //end of factory class
	}
}
